package com.worker.SecurityJwt;

import org.springframework.stereotype.Service;

@Service
public class JwtService {
private static final String secretkey="67556B586E3272357538782F413F4428472B4B6250655368566D5971337336763979244226452948404D635166546A576E5A7234753777217A25432A462D4A614E645267556B58703273357638792F413F4428472B4B6250655368566D597133743677397A244326452948404D635166546A576E5A7234753778214125442A47";

	public String extractusernamefromtoken(String token) {
		return null;
	}
	private Claims  extractclaims(String token) {
		
	}

}
