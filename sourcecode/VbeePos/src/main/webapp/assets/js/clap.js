function clap(giftId) {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == XMLHttpRequest.DONE && this.status == 200) {
			var respond = JSON.parse(this.responseText);
			document.getElementById('clap-count-' + giftId).innerHTML = respond.clapCount;
			if (document.getElementById('profile-points') !== null) {
				document.getElementById('profile-points').innerHTML = respond.points;
			}
		}
	};
	xhttp.open('POST', 'http://localhost:8080/vbeepos/claps/', true);
	xhttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	xhttp.send('giftId=' + giftId);
}
