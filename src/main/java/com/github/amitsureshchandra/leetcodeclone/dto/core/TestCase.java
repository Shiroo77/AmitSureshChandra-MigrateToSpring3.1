package com.github.amitsureshchandra.leetcodeclone.dto.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestCase {
    private String input;
    private boolean sample;
    private String ans;
}
