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
      <div class="items1"><h1>맛집 리스트</h1></div>
      <div class="items2">
        <table>
          <thead>
            <tr>
              <th>등록번호</th>
              <th>가게명</th>
              <th>주소</th>
              <th>전화번호</th>
              <th>대표메뉴</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${restaurants}" var="restaurant" varStatus="status">
            <tr>
              <td><a href="/restaurant-detail?pk=${restaurant.pk}">${restaurant.pk}</a></td>
              <td><a href="/restaurant-detail?pk=${restaurant.pk}">${restaurant.name}</a></td>
              <td>${restaurant.address}</td>
              <td>${restaurant.tel}</td>
              <td>${restaurant.menu}</td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
      <div class="items3"><button class="button_base b01_simple_rollover" onclick="window.location.href='/restaurant-create'">+ 맛집 추가</button></div>
    </div>
  </div>
</body>
</html>