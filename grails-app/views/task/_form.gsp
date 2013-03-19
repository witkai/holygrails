<%@ page import="cc.Task" %>



<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="task.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${taskInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'priority', 'error')} required">
	<label for="priority">
		<g:message code="task.priority.label" default="Priority" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="priority" from="${1..5}" class="range" required="" value="${fieldValue(bean: taskInstance, field: 'priority')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'startDate', 'error')} required">
	<label for="startDate">
		<g:message code="task.startDate.label" default="Start Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="startDate" precision="day"  value="${taskInstance?.startDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'endDate', 'error')} required">
	<label for="endDate">
		<g:message code="task.endDate.label" default="End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="endDate" precision="day"  value="${taskInstance?.endDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'completed', 'error')} ">
	<label for="completed">
		<g:message code="task.completed.label" default="Completed" />
		
	</label>
	<g:checkBox name="completed" value="${taskInstance?.completed}" />
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'quest', 'error')} required">
	<label for="quest">
		<g:message code="task.quest.label" default="Quest" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="quest" name="quest.id" from="${cc.Quest.list()}" optionKey="id" required="" value="${taskInstance?.quest?.id}" class="many-to-one"/>
</div>

