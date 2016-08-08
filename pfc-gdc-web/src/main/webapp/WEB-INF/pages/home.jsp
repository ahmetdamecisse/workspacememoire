<%@taglib prefix="sec"
          uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:p="http://primefaces.org/ui"
      xmlns:sec="http://www.springframework.org/security/tags"
      xmlns:c="http://xmlns.jcp.org/jsp/jstl/core"> 
    <body>
        <!--********************************************La sécurité************************-->
        <sec:authorize access="hasRole('ROLE_USER')">
            <!-- For login user -->
            <c:url value="/j_spring_security_logout" var="logoutUrl" />
            <form action="${logoutUrl}" method="post" id="logoutForm">
                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}" />
            </form>
            <script>
                function formSubmit() {
                    document.getElementById("logoutForm").submit();
                }
            </script>
            <c:if test="${pageContext.request.userPrincipal.name != null}">
                <h2>
                    User : ${pageContext.request.userPrincipal.name} | <a
                        href="javascript:formSubmit()"> Logout</a>
                </h2>
            </c:if>

            <div>
                <f:view >
                    <p:panel id="primefacesPanel"  header="Hello World"
                             footer="Footer"
                             style="position: relative; width: 500px; " >
                        <h:outputText value="Primefaces is great. My first application using Primefaces"/>
                    </p:panel>
                </f:view>
            </div>
        </sec:authorize>
        <!--********************************************La sécurité************************-->
        <h1>Title : ${title}</h1>
        <h1>Message : ${message}</h1>
    </body>
</html>