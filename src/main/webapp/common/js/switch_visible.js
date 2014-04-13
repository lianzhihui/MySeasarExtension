$(document).ready(function() {
	
	$(".switch-visible").click(function()　{	
		switchVisible(this);
	});
	
	
	$(".switch-visible").each(function() {
		if (this.checked) {
			switchVisible(this);
		}
	});
});


function switchVisible(obj) {

	var switchBottonId = obj.id;
	var isCheck = obj.checked;

	var visibleTargetCssClass = switchBottonId + "-visible";		
	$("." + visibleTargetCssClass).each(function() {
		if (isCheck) {
			$(this).show();
		}
	});

	var invisibleTargetCssClass = switchBottonId + "-invisible";
	$("." + invisibleTargetCssClass).each(function() {
		if (isCheck) {
			$(this).hide();
		}
	});
}