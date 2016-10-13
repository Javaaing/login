$(function(){
	$('#login_div').dialog({
		title: '系统登录',    
		width: 350,    
		height: 260,    
		closed: false,
		iconCls:"icon-ok",
		cache: false,     
		modal: true,
		buttons:[{
			text:'登录',
			handler:function(){
				alert("保存");
			}
			},{
			text:'重置',
			handler:function(){
			alert("确定")
			}
		}]
	});
	});