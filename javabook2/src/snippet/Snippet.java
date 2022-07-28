package snippet;

public class Snippet {
	<c:set var="page" value="${(empty param.p)?1:param.p}"/>
		<c:set var="startNum" value="${page-(page-1)%5}"/>
		<c:set var="lastNum" value="${fn:substringBefore(Math.ceil(count/10),'.')}"/>
}

