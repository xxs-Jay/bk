function findJava(){
		$.ajax({
			url : "boke_java.do",
			type : "post",
			data: JSON.stringify(1),
			contentType:"application/json;charset=utf-8",
			datatype : "json",
			success : function(result) {
				var html = "<table class='table'><tr><td>标题</td><td>内容</td><td>备注</td></tr>";
                for(var i = 1; i <= result.length; i++){
                		html+="<tr>"
                     html+="<td>"+result[i-1].bTitle+"</td>"
                     html+="<td>"+result[i-1].bContent+"</td>";
                		html+="<td>"+result[i-1].bDesc+"</td>";
                		html+="</tr>";
                }
                html += "</table>";
                $("#java_table").html(html);
			},
			error : function(status) {
				alert("错误");
			}
		});	
}