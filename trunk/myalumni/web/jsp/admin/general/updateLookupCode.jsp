<%@ taglib uri="/WEB-INF/tld/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c" %>


<c:set var="adminTab" scope="session" value="general"/>


<tiles:insert definition="myalumni.admin" flush="true">
  <tiles:put name="title" value="Administration - Update Lookup Code" />
  <tiles:put name="body" value="/jsp/admin/general/body/updateLookupCode-body.jsp" />
</tiles:insert>