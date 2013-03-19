<%@ page import="cc.Task" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:javascript library="jquery"/>
		<g:set var="entityName" value="${message(code: 'task.label', default: 'Task')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-task" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>

		<g:formRemote name="taskDetail" url="[action:'detail']" update="display">
			<g:select name="id" from="${tasks}" optionKey="id" optionValue="name"/>
			<input type="submit" value="Get Details"/>
		</g:formRemote>
		<div id="display"></div>

	</body>
</html>
