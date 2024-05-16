package org.zerock.b01.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity         //엔터티 선언
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
        IDENTITY : 데이터베이스에 위임(AUTO_INCREMENT)
        SEQUENCE : 데이터베이스 시퀸스 오브젝트 사용 - @SequenceGenerator 필요함(오라클할때 사용)
        TABLE : 키 생성용 테이블 사용. 모든 DB에서 사용 - @TableGenerator 필요함
        AUTO : 방언(내가쓰는 DB)에 따라서 자동 지정됨. 기본값
    */
    private Long bno;

    @Column(length = 500, nullable = false) //컬럼의 길이와 null 허용여부
    private String title;

    @Column(length = 2000, nullable = false)
    private String content;

    @Column(length = 50, nullable = false)
    private String writer;

}
