package org.abc.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consumer {
@Id
private Integer SNo;
private String Name;
private String Email;
private Long Mobile;
private String Gender;
private Long SSN;

private String PlanName;
private String PlanStatus;
private String StartDt;
private String EndDt;
}
