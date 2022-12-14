# Clinic management Backend - Spring boot

[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://coveralls.io/github/codecentric/springboot-sample-app?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Techs
- Spring boot
- Spring data jpa, Hibernate 
- Spring security
- Mysql


## Overview

### 1. Mô tả chung

Giao diện cho website quản lý phòng mạch được xây dựng với Reactjs sử dụng API do spring boot cung cấp.

    ### 2. Database schema

<img src="https://res.cloudinary.com/tamdev/image/upload/v1666154112/clinic/images/erd_ebqkvm.png">


### 3. Swagger API documentation

<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056525/clinic/Swagger_UI-01_u5owzn.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056526/clinic/Swagger_UI-02_aksaee.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056526/clinic/Swagger_UI-03_mdjoby.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056526/clinic/Swagger_UI-04_q8jy5f.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056526/clinic/Swagger_UI-05_pn9ve5.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056526/clinic/Swagger_UI-06_moerjr.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056525/clinic/Swagger_UI-07_r0jyzq.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056526/clinic/Swagger_UI-08_kqqirb.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056526/clinic/Swagger_UI-09_eg3en3.png">
<img src="https://res.cloudinary.com/tamdev/image/upload/v1666056527/clinic/Swagger_UI-10_ajuv6y.png">




### 4. Chức năng

-   Người dùng hệ thống (Một user có nhiều roles)
    -   Patient:
        -   Đăng ký/sửa/xóa lịch khám
        -   Xem lịch sử khám
        -   Chat với bác sĩ
        -   Quản lý tài khoản
        -   Nhận mail thông báo
    -   Doctor:
        -   Nhận danh sách khám bệnh
        -   Khám bệnh
            -   Thêm/sửa/xóa/xem phiếu khám (Bệnh nhân có thể có nhiều phiếu khám)
                -   Xem lịch sử khám bệnh của bệnh nhân bằng sđt
            -   Thêm/sửa/xóa/xem toa thuốc (Phiếu khám có thể có nhiều toa thuốc)
                -   Tìm kiếm thuốc
                -   Thêm thuốc (Toa thuốc có thể có nhiều thuốc)
            -
    -   Nurse:
        -   Xác nhận lịch khám và tự động gửi mail
        -   Thanh toán online
    -   Admin:
        -   Thêm/sửa/xóa các entities
        -   Thay đổi các quy tắc (Tiền khám, số bệnh nhân tối đa)
        -   Thống kê

### Hình ảnh minh họa các chức năng
