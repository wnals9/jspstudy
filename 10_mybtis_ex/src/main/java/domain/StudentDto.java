package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDto {
  private int studentNo;
  private String name;
  private int korean;
  private int english;
  private int math;
  private double average;
}
