package com.flink.ireview.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardGroupApiRequest {
    private Long id;
    private String status;
    //private Long user_id;
    //private Long board_id;



}
