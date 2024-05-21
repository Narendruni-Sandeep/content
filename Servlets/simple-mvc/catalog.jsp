<%@ page import = "java.io.*,java.util.*,com.nkxgen.mvc.*"%>
 <html>
   <head>
      <title>Product Catalog</title>
   </head>

      <table border = "1" width = "100%">
         <tr>
            <th>Product No</th>
            <th>Product Name</th>
            <th>Stock</th>
            <th>Price</th>
            <th>Product Image</th>
         </tr>
<%
		List<Product> plist=(List<Product>)request.getAttribute("prods");
		for(Product prod:plist){
%>	
            <tr>
               <td><%=prod.getProductNo() %></td>
               <td><%=prod.getProductName() %></td>
               <td><%=prod.getStock() %></td>
               <td><%=prod.getPrice() %></td>
               <td><%=prod.getPFile() %></td>
            </tr>
<%
		}
%>
      </table>
 
   </body>
</html>