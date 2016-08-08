<%@taglib prefix="sec"
          uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <h:head>
        <f:facet name="first">
            <meta http-equiv="X-UA-Compatible" content="IE=edge" />
            <meta content="text/html; charset=UTF-8" http-equiv="Content-Type" />
            <meta name="viewport" content="width=device-width, initial-scale=1" />
            <title>candidat</title>
        </f:facet>
        <f:facet name="middle">
            <h:outputStylesheet name="bootstrap/css/bootstrap.css" />
            <h:outputStylesheet name="bootstrap/css/bootstrap.min.css" />
            <h:outputStylesheet name="bootstrap/css/responsive.css" />
            <h:outputStylesheet name="css/dashboard.css" />
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" />
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
            <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
            <h:outputScript name="bootstrap/js/bootstrap.min.js"/>
            <h:outputStylesheet library="css" name="style.css"/>
            <h:outputScript library="js" name="common.js" />
        </f:facet>
        <f:facet name="last">
            <h:outputStylesheet name="css/font-awesome.css" />
        </f:facet>
    </h:head>
    <body style="background-image: url(https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQowKYcQsdGJ0scyENcCKh_KJRDGyJEVpHcq4OeYcpAgOGdL9KZ);background-repeat: no-repeat; background-size: cover">
        <!--********************************************La sécurité************************-->
        <sec:authorize access="hasRole('ROLE_CANDIDAT')">
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
        </sec:authorize>
        <!--********************************************La sécurité************************-->
        <h1>Title : ${title}</h1>
        <h1>Message : ${message}</h1>
        <!--********************************************************************-->

    
</body>
</html>