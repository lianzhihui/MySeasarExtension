$(document).ready(function() {
	$(".check-all").click(function()　{
		var checkAllId = this.id;
		var targetCheckBoxCssClass = checkAllId.substring(checkAllId.indexOf("-") + 1);
		
		var isCheck = this.checked;
		
		$("." + targetCheckBoxCssClass).each(function() {
			if (isCheck) {
				$(this).attr('checked', true);
			} else {
				$(this).attr('checked', false);
			}
		});
	});
});