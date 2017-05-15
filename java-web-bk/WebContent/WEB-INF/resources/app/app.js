		//首页
        $(function(){
            $("#java").load("resources/app/java/java.html");
            findJava();
        })
    		//其他页面---路由器
        function tab(id,url){
            $('#'+id).load(url);//ajax加载页面
            if(id == "java"){
            		findJava();//java
            }
        }