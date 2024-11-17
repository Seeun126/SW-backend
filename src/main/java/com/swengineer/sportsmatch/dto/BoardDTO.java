package com.swengineer.sportsmatch.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로하는 생성자
public class BoardDTO {
    private Long post_id;
    private String post_type;
    private String post_writer;
    private String post_title;
    private String post_content;
    //private String post_imagePath;
    private int post_hits;
    private LocalDateTime post_created_time;
    private LocalDateTime post_updated_time;
    private int post_like_count;
    private int post_dislike_count;
    private int post_report_count;
    private int post_comment_count;

}
