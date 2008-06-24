<%@ taglib uri="/WEB-INF/tld/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c" %>

<c:set var="menuTab" scope="session" value="aboutus"/>
<c:remove var="subMenu" />

<tiles:insert definition="myalumni.base" flush="true">
  <tiles:put name="title" value="About Us" />
  <tiles:put name="body" value="/jsp/aboutus/body/index-body.jsp" />
</tiles:insert>