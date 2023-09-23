package com.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class response {

	private String filename;
	private String downloadfile;
	private String fileType;
	private long fileSize;

}
