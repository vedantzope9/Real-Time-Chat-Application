package org.vz.chatapp.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChatMessage {
    //private Long id;
    private String sender;
    private String content;
}
