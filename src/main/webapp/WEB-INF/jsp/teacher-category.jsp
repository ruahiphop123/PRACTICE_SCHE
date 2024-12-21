<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/category.css">
    <div id="category">
        <div id="category_header">
            <div id="category_header_logo">
                <img src="${pageContext.request.contextPath}/img/" alt="">
            </div>
        </div>
        <div id="category_body">
            <div id="category_body_home">
                <ul class="category-index-container" id="cat_home_box">
                    <li class="index">
                        <a class="index_wrapper" href="/home">
                            <i class="fa-solid fa-tv"></i>
                            <p>Trang chủ</p>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="category_body_practice-schedule">
                <label>LỊCH THỰC HÀNH</label>
                <ul class="category-index-container" id="cat_practice-schedule_box">
                    <li class="index">
                        <a class="index_wrapper" href="/teacher/category/practice-schedule/teacher-request-list">
                            <i class="fa-regular fa-envelope"></i>
                            <p>Toàn bộ yêu cầu</p>
                        </a>
                    </li>
                    <li class="index">
                        <a class="index_wrapper" href="/teacher/category/practice-schedule/add-teacher-request">
                            <i class="fa-regular fa-paper-plane"></i>
                            <p>Tạo yêu cầu</p>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div id="category_footer">
            <ul class="category-index-container">
                <li class="index">
                    <a class="index_wrapper" href="">
                        <i class="fa-regular fa-life-ring"></i>
                        <p>Support</p>
                    </a>
                </li>
            </ul>
        </div>
    </div>