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

$('#popup-clappers')
		.on(
				'show.bs.modal',
				function(event) {
					var giftId = $(event.relatedTarget).data('val');

					var xhttp = new XMLHttpRequest();
					xhttp.onreadystatechange = function() {
						if (this.readyState == XMLHttpRequest.DONE
								&& this.status == 200) {
							var data = JSON.parse(this.responseText);
							$('#list-clappers').empty();
							for ( var i in data) {
								$('#list-clappers')
										.append(
												'<li class="list-group-item">'
														+ data[i].name
														+ '<span class="btn btn-primary pull-right">'
														+ data[i].count
														+ '</span>' + '</li>');
							}
						}
					};

					xhttp.open('GET',
							'http://localhost:8080/vbeepos/claps/group-by-name/json/?giftId='
									+ giftId, true);
					xhttp.setRequestHeader('Content-Type',
							'application/x-www-form-urlencoded');
					xhttp.send();

				});
