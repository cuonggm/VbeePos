function loadSuggestUsers() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			console.log(this.responseText);
			var jsonObj = JSON.parse(this.responseText);
			console.log(jsonObj);
			setAutoComplete(jsonObj);
		}
	};
	xhttp.open("GET", "http://localhost:8080/vbeepos/users/json/", true);
	xhttp.send();
}

function setAutoComplete(json) {
	$('#receiver').autocomplete({
		nameProperty : 'displayInfo',
		valueProperty : 'accountId',
		valueField : '#receiver_id',
		dataSource : json
	});
};

$(document).ready(loadSuggestUsers);
