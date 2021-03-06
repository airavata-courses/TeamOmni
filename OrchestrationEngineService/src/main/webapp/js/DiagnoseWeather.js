angular
		.module('omni')
		.controller(
				'DiagnoseWeather',
				[
						'$scope',
						'$http',
						function($scope, $http) {
							$scope.click = function() {

								/*
								 * Basic JS validation
								 */
								if (null == document.getElementById('idToken')
										|| document.getElementById('idToken').value == "") {
									window.location = '#login';
									return false;
								}
								if (null == $scope.station
										|| null == $scope.date
										|| null == $scope.time) {
									alert("Please enter "
											+ (null == $scope.date ? "Date"
													: (null == $scope.time ? "Time"
															: "Station Name")));
									return false;
								}

								var idToken = document
										.getElementById('idToken').value;
								var uid = document.getElementById('uid').value;

								// Compute dateString
								var day = $scope.date.getDate();
								var mon = $scope.date.getMonth() + 1;
								var year = $scope.date.getFullYear();
								var dateString = ""
										+ (mon < 10 ? "0" + mon : mon) + "/"
										+ (day < 10 ? "0" + day : day) + "/"
										+ year;

								// Compute timeString
								var hour = $scope.time.getHours();
								var min = $scope.time.getMinutes();
								var sec = $scope.time.getSeconds();
								var timeString = ""
										+ (hour < 10 ? "0" + hour : hour)
										+ (min < 10 ? "0" + min : min)
										+ (sec < 10 ? "0" + sec : sec);

								$http({
									url : "rest/services/initiate/",
									method : "GET",
									params : {
										"uid" : uid,
										"idtoken" : idToken,
										"date" : dateString,
										"time" : timeString,
										"station" : $scope.station
									}
								})
										.success(function(response) {
											$scope.status = response;
											alert($scope.status);
										})
										.error(
												function(response) {
													$scope.status = "Error while processing...";
												});
							}

							$scope.fetch_status = function() {

								// Check if idToken is set, if not then redirect
								// to login page
								if (null == document.getElementById('idToken')
										|| document.getElementById('idToken').value == "") {
									window.location = '#login';
									return false;
								}

								var idToken = document
										.getElementById('idToken').value;
								var uid = document.getElementById('uid').value;

								$http({
									url : "rest/services/queryStatus/" + uid,
									method : "GET",
									params : {
										"idtoken" : idToken
									}
								})
										.success(
												function(response) {
													var resp_data = response.data;
													if (response.type == "status") {
														alert(resp_data.executionStatus);
													} else {
														alert("Weather: "
																+ resp_data.weatherType
																+ "\n"
																+ "Temperature Unit: "
																+ resp_data.temperatureUnit
																+ "\n"
																+ "Temperature: "
																+ resp_data.temperatureValue
																+ "\nWind Speed Unit: "
																+ resp_data.windSpeedUnit
																+ "\nWind Speed: "
																+ resp_data.windSpeedVal)
													}
												})
										.error(
												function(response) {
													if (response.data &&  response.data.executionStatus) {
														alert(response.data.executionStatus)
													} else if (response.message) {
														alert(response.message);
													} else {
														alert("Unknown Error Detected")
													}
												})
							}
						} ]);