package com.abhi.auth.modals;/*
    @author jadon
*/

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtResponse {

    private String jwtToken;

    private String userName;


}
