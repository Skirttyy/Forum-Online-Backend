package dev.skirtty.lab1.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "topics")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User user;

    private String title;

    @Column(name = "is_pinnned")
    private boolean isPinned;

    @Column(name = "is_locked")
    private boolean isLocked;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime created_at;

}
