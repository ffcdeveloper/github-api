package br.com.trustly.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InformationGitHubDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	// Searched github information
	private String extension;
	private Integer count;
	private Integer lines;
	private Integer bytes;

}
