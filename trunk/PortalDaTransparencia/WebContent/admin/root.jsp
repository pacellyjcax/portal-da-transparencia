<%@page import="br.com.millercs.models.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta>
<title>Admin</title>

<!-- CSS -->
<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700'
	rel='stylesheet'>
<link rel="stylesheet" href="../_assets/css/style.css">

<!-- Mobile Devices Check -->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- jQuery & JS files -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="_assets/js/script.js"></script>
</head>
<body>
<% Usuario usuario = (Usuario)session.getAttribute("logado"); %>
	<!-- TOP BAR -->
	<div id="top-bar">

		<div class="page-full-width cf">

			<ul id="nav" class="fl">

				<li class="v-sep"><a href="#"
					class="round button dark ic-left-arrow image-left">Go to
						website</a></li>
				<li class="v-sep"><a href="#"
					class="round button dark menu-user image-left">Logged in as <strong><%=usuario.getLogin() %></strong></a>
					<ul>
						<%
							for (int i = 0; i < 10; i++) {
						%>
						<li><a href="#">My Profile</a></li>
						<%
							}
						%>
					</ul></li>

				<li><a href="#"
					class="round button dark menu-email-special image-left">3 new
						messages</a></li>
				<li><a href="/PortalDaTransparencia"
					class="round button dark menu-logoff image-left">Log out</a></li>

			</ul>
			<!-- end nav -->


			<form action="#" method="POST" id="search-form" class="fr">
				<fieldset>
					<input type="text" id="search-keyword"
						class="round button dark ic-search image-right" name=""
						placeholder="Search..." /> <input type="hidden" value="SUBMIT" />
				</fieldset>
			</form>

		</div>
		<!-- end full-width -->

	</div>
	<!-- end top-bar -->



	<!-- HEADER -->
	<div id="header-with-tabs">

		<div class="page-full-width cf">

			<ul id="tabs" class="fl">
				<li><a href="dashboard.html" class="active-tab dashboard-tab">Dashboard</a></li>
				<li><a href="page-full-width.html">Full width page</a></li>
				<li><a href="page-other.html">Other page elements</a></li>
			</ul>
			<!-- end tabs -->

			<!-- Change this image to your own company's logo -->
			<!-- The logo will automatically be resized to 30px height. -->
			<a href="#" id="company-branding-small" class="fr"><img
				src="images/company-logo.png" alt="Blue Hosting" /></a>

		</div>
		<!-- end full-width -->

	</div>
	<!-- end header -->



	<!-- MAIN CONTENT -->
	<div id="content">

		<div class="page-full-width cf">

			<div class="side-menu fl">

				<h3>Side Menu</h3>
				<ul>
					<li><a href="#">Side menu link</a></li>
					<li><a href="#">Another link</a></li>
					<li><a href="#">A third link</a></li>
					<li><a href="#">Fourth link</a></li>
				</ul>

			</div>
			<!-- end side-menu -->

			<div class="side-content fr">

				<div class="content-module">

					<div class="content-module-heading cf">

						<h3 class="fl">Table design</h3>
						<span class="fr expand-collapse-text">Click to collapse</span> <span
							class="fr expand-collapse-text initial-expand">Click to
							expand</span>

					</div>
					<!-- end content-module-heading -->


					<div class="content-module-main">

						<table>

							<thead>

								<tr>
									<th><input type="checkbox" id="table-select-all"></th>
									<th>Name</th>
									<th>Username</th>
									<th>Email</th>
									<th>Actions</th>
								</tr>

							</thead>

							<tfoot>

								<tr>

									<td colspan="5" class="table-footer"><label
										for="table-select-actions">With selected:</label> <select
										id="table-select-actions">
											<option value="option1">Delete</option>
											<option value="option2">Export</option>
											<option value="option3">Archive</option>
									</select> <a href="#" class="round button blue text-upper small-button">Apply
											to selected</a></td>

								</tr>

							</tfoot>

							<tbody>

								<tr>
									<td><input type="checkbox"></td>
									<td>Adrian Purdila</td>
									<td>adipurdila</td>
									<td><a href="#">adipurdila@gmail.com</a></td>
									<td><a href="#" class="table-actions-button ic-table-edit"></a>
										<a href="#" class="table-actions-button ic-table-delete"></a>
									</td>
								</tr>

								<tr>
									<td><input type="checkbox"></td>
									<td>Adrian Purdila</td>
									<td>adipurdila</td>
									<td><a href="#">adipurdila@gmail.com</a></td>
									<td><a href="#" class="table-actions-button ic-table-edit"></a>
										<a href="#" class="table-actions-button ic-table-delete"></a>
									</td>
								</tr>

								<tr>
									<td><input type="checkbox"></td>
									<td>Adrian Purdila</td>
									<td>adipurdila</td>
									<td><a href="#">adipurdila@gmail.com</a></td>
									<td><a href="#" class="table-actions-button ic-table-edit"></a>
										<a href="#" class="table-actions-button ic-table-delete"></a>
									</td>
								</tr>

								<tr>
									<td><input type="checkbox"></td>
									<td>Adrian Purdila</td>
									<td>adipurdila</td>
									<td><a href="#">adipurdila@gmail.com</a></td>
									<td><a href="#" class="table-actions-button ic-table-edit"></a>
										<a href="#" class="table-actions-button ic-table-delete"></a>
									</td>
								</tr>

								<tr>
									<td><input type="checkbox"></td>
									<td>Adrian Purdila</td>
									<td>adipurdila</td>
									<td><a href="#">adipurdila@gmail.com</a></td>
									<td><a href="#" class="table-actions-button ic-table-edit"></a>
										<a href="#" class="table-actions-button ic-table-delete"></a>
									</td>
								</tr>

								<tr>
									<td><input type="checkbox"></td>
									<td>Adrian Purdila</td>
									<td>adipurdila</td>
									<td><a href="#">adipurdila@gmail.com</a></td>
									<td><a href="#" class="table-actions-button ic-table-edit"></a>
										<a href="#" class="table-actions-button ic-table-delete"></a>
									</td>
								</tr>

							</tbody>

						</table>

					</div>
					<!-- end content-module-main -->

				</div>
				<!-- end content-module -->

				<div class="content-module">

					<div class="content-module-heading cf">

						<h3 class="fl">Form Elements</h3>
						<span class="fr expand-collapse-text">Click to collapse</span> <span
							class="fr expand-collapse-text initial-expand">Click to
							expand</span>

					</div>
					<!-- end content-module-heading -->


					<div class="content-module-main cf">

						<div class="half-size-column fl">

							<form action="#">

								<fieldset>

									<p>
										<label for="simple-input">Simple input</label> <input
											type="text" id="simple-input"
											class="round default-width-input" />
									</p>

									<p>
										<label for="full-width-input">A full width input</label> <input
											type="text" id="full-width-input"
											class="round full-width-input" /> <em>This is a full
											width input. It will take 100% of the available width.</em>
									</p>

									<p>
										<label for="another-simple-input">Text input with
											additional description</label> <input type="text"
											id="another-simple-input" class="round default-width-input" />
										<em>You can add a hint or a small description here.</em>
									</p>

									<p class="form-error">
										<label for="error-input">Error text input</label> <input
											type="text" id="error-input"
											class="round default-width-input error-input" /> <em>This
											is an optional error description that can be associated with
											an input.</em>
									</p>

								</fieldset>

							</form>

						</div>
						<!-- end half-size-column -->

						<div class="half-size-column fr">

							<form action="#">

								<fieldset>

									<p>
										<label for="textarea">Textarea</label>
										<textarea id="textarea" class="round full-width-textarea"></textarea>
									</p>

									<div class="stripe-separator">
										<!--  -->
									</div>

									<p>
										<label>Checkboxes</label> <label for="selected-checkbox"
											class="alt-label"><input type="checkbox"
											id="selected-checkbox" checked="checked" />A selected
											checkbox</label> <label for="unselected-checkbox" class="alt-label"><input
											type="checkbox" id="unselected-checkbox" />An uselected
											checkbox</label>
									</p>

									<p>
										<label>Radio buttons</label> <label for="selected-radio"
											class="alt-label"><input type="radio"
											id="selected-radio" checked="checked" />A selected radio</label> <label
											for="unselected-radio" class="alt-label"><input
											type="radio" id="unselected-radio" />An uselected radio</label>
									</p>

									<p class="form-error-input">
										<label for="dropdown-actions">Dropdown</label> <select
											id="dropdown-actions">
											<option value="option1">Select your action here</option>
										</select>
									</p>

									<div class="stripe-separator">
										<!--  -->
									</div>

									<input type="submit" value="Submit Button"
										class="round blue ic-right-arrow" />

								</fieldset>

							</form>

						</div>
						<!-- end half-size-column -->

					</div>
					<!-- end content-module-main -->

				</div>
				<!-- end content-module -->

				<div class="half-size-column fl">

					<div class="content-module">

						<div class="content-module-heading cf">

							<h3 class="fl">A half size box</h3>
							<span class="fr expand-collapse-text">Click to collapse</span> <span
								class="fr expand-collapse-text initial-expand">Click to
								expand</span>

						</div>
						<!-- end content-module-heading -->


						<div class="content-module-main">

							<div class="information-box round">This is an information
								box. It will resize based on it’s contents.</div>

							<div class="confirmation-box round">This is a confirmation
								box. It will resize based on it’s contents.</div>

							<div class="error-box round">This is an error box. It will
								also resize based on it’s contents.</div>

							<div class="warning-box round">This is a warning box. It
								will also resize based on it’s contents.</div>

						</div>
						<!-- end content-module-main -->

					</div>
					<!-- end content-module -->

				</div>

				<div class="half-size-column fr">

					<div class="content-module">

						<div class="content-module-heading cf">

							<h3 class="fl">Another half size box</h3>
							<span class="fr expand-collapse-text">Click to collapse</span> <span
								class="fr expand-collapse-text initial-expand">Click to
								expand</span>

						</div>
						<!-- end content-module-heading -->


						<div class="content-module-main cf">

							<ul class="temporary-button-showcase">
								<li><a href="#"
									class="button round blue image-right ic-add text-upper">Add</a></li>
								<li><a href="#"
									class="button round blue image-right ic-edit text-upper">Edit</a></li>
								<li><a href="#"
									class="button round blue image-right ic-delete text-upper">Delete</a></li>
								<li><a href="#"
									class="button round blue image-right ic-download text-upper">Download</a></li>
								<li><a href="#"
									class="button round blue image-right ic-upload text-upper">Upload</a></li>
								<li><a href="#"
									class="button round blue image-right ic-favorite text-upper">Favorite</a></li>
								<li><a href="#"
									class="button round blue image-right ic-print text-upper">Print</a></li>
								<li><a href="#"
									class="button round blue image-right ic-refresh text-upper">Refresh</a></li>
								<li><a href="#"
									class="button round blue image-right ic-search text-upper">Search</a></li>
							</ul>

						</div>
						<!-- end content-module-main -->

					</div>
					<!-- end content-module -->

				</div>

			</div>
			<!-- end side-content -->

		</div>
		<!-- end full-width -->

	</div>
	<!-- end content -->



	<!-- FOOTER -->
	<div id="footer">

		<p>
			&copy; Copyright 2012 <a href="#">BlueHosting, LLC</a>. All rights
			reserved.
		</p>
		<p>
			<strong>SimpleAdmin</strong> theme by <a
				href="http://www.adipurdila.com">Adi Purdila</a>
		</p>

	</div>
	<!-- end footer -->

</body>
</html>