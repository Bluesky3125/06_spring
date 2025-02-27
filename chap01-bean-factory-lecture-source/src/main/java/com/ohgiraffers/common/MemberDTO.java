package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
//@Data // 개발은 편하지만 쓸데없는 것을 많이 만들고, 내부 클래스를 만드는 등 성능 저하가 일어난다.
public class MemberDTO {
    private int sequence;
    private String id;
    private String pwd;
    private String name;
}
