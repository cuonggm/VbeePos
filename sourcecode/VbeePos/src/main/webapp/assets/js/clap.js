function clap(giftId) {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == XMLHttpRequest.DONE && this.status == 200) {
			document.getElementById("clap-count-" + giftId).innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "http://localhost:8080/vbeepos/claps/", true);
	xhttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	xhttp.send("giftId=" + giftId);
}
