<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="./css/common.css" rel="stylesheet">
  <title>맛집정보리스트</title>
</head>

<body>
  <div class="wrap">
    <div class="container">
      <div class="items1"><h1>맛집 등록</h1></div>
      <form method="post" action="restaurant-create" onsubmit="event.preventDefault();">
        <div class="items2-create1">
          <table>
            <tbody>
              <c:if test="${from ne 'create'}">
              <tr>
                <th>등록번호</th>
                <td><input type="text" name="pk" value="${restaurant.pk}" readonly></td>
              </tr>
              </c:if>
              <tr>
                <th>가게명</th>
                <td><input type="text" name="name" value="${restaurant.name}" <c:if test="${from eq 'detail'}"> readonly </c:if>></td>
              </tr>
              <tr>
                <th>주소</th>
                <td><input type="text" name="address" value="${restaurant.address}" <c:if test="${from eq 'detail'}"> readonly </c:if>></td>
              </tr>
              <tr>
                <th>전화번호</th>
                <td><input type="text" name="tel" value="${restaurant.tel}" <c:if test="${from eq 'detail'}"> readonly </c:if>></td>
              </tr>
              <tr>
                <th>대표메뉴</th>
                <td><input type="text" name="menu" value="${restaurant.menu}" <c:if test="${from eq 'detail'}"> readonly </c:if>></td>
              </tr>
            </tbody>
          </table>
        </div>

        <div class="items3">
          <c:choose>
            <c:when test="${from eq 'create'}">
              <button class="button_base b01_simple_rollover" onclick="this.form.submit();">등록완료</button>
            </c:when>
            <c:when test="${from eq 'detail'}">
              <button class="button_base b01_simple_rollover" onclick="window.location.href='/restaurant-update?pk=${restaurant.pk}'">수정</button>
              <button class="button_base b01_simple_rollover" onclick="this.form.action = 'restaurant-delete'; this.form.submit();">삭제</button>
            </c:when>
            <c:when test="${from eq 'update'}">
              <button class="button_base b01_simple_rollover" onclick="this.form.action = 'restaurant-update'; this.form.submit();">수정완료</button>
            </c:when>
          </c:choose>
          <button class="button_base b01_simple_rollover" onclick="window.location.href='/restaurant-list'">목록보기</button>
        </div>
      </form>
    </div>
  </div>
</body>
</html>