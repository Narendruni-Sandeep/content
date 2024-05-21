create or replace procedure calinterest() as 
	Cursor caccounts is select accno,op_date,balance from accounts;
	cb number;
	bod date;
	balod number;
	mnthpamt number;
	imamt number;
	giamt number:=0;
begin
	if to_char(sysdate,'MON') = 'APR' OR to_char(sysdate,'MON') = 'OCT' then
	    --looping through all accounts
	    for act in caccounts
	    loop
		giamt:=0;
		bod:=to_date('10-' || to_char(add_months(sysdate,-6),'MON-YY'));
		if (act.op_date > bod) then
		    if (to_char(act.op_date,'DD') > 10) then
			bod:=to_date('10-' || to_char(add_months(act.op_date,1),'MON-YY'));
		    end if;
		end if;
	
	        cb:=act.balance;
	       --loop for six months/few months
	      loop
		exit when to_char(bod,'MON-YY') = to_char(sysdate,'MON-YY');
		balod:=BalanceAsOnDate(act.accno,bod);
		mnthpamt:=getlowestbalance(act.accno,balod,bod,last_day(bod));
		imamt:=mnthpamt*5.5/1200;
		--accumulate the interest
		giamt:=giamt+imamt;
		--increment the month
		bod:=add_months(bod,1);
	      end loop;
		--deposit back the interest amount to account
		insert into transaction(act.accno,sysdate,'D',giamt);
		update accounts set balance=balance+giamt where accno=act.accno;
	    end loop;
	
	else
		dbms_output.put_line('sorry this is not the time to calculate interest");

        end if;
end;
/