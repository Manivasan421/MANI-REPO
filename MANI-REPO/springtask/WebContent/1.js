  $(document).ready(
			function() {
				$('#mon').change(function() {
					var month = $(this).val();
					$('[name=month]').val(month);
				});
				$('#sdate').change(function() {
					var sdate = $(this).val();
					$('[name=stratdate]').val(sdate);
				});
				$('#edate').change(function() {
					var edate = $(this).val();
					$('[name=enddate]').val(edate);
				});

				$('#mon').change(
						function() {
							var month1 = $('[name=month]').val();
							$.ajax({
								type : "POST",
								url : "date.do",
								data : "date=" + month1,
								success : function(response) {
									var res = response.split(",");
									$('#pname').children('option:not(:first)')
											.remove();
									if (response != "") {
										for (i = 0; i < res.length; i++) {
											if (res[i] != "") {
												$("#pname").append(
														'<option value='+res[i]+'>'
																+ res[i]
																+ '</option>');
											}
										}
									}
								}
							});
						});

				$('#pname').change(function() {
					var name = $('#pname').val();
					$.ajax({
						type : "POST",
						url : "getdetail.do",
						data : "name=" + name,
						success : function(response1) {
							var response = response1.split(",");
							$('#mon').val(response[0]);
							$('[name=projectname]').val(response[1]);
							$('[name=prjectid]').val(response[2]);
							$('[name=projectdetail]').val(response[3]);
							$('[name=created]').val(response[4]);
							$('#sdate').val(response[5]);
							$('#edate').val(response[6]);
							$('[name=status]').val(response[7]);
						}
					});
				});

			});
