package com.wowowo.constant;

public class JGitConstant {
	/**
	 * 文件路径复制过来之后把\替换成/！！！！！
	 * 如果想要获取以前提交的文件,把flag设为true,并填写你当前版本的commitid，如果在提交之后直接获取修改的文件,flag设为false
	 * 
	 */
	// 仓库所在url
	public static final String gitRoot = "D:/workspace2/oa_maven_ssm";
	// 该次提交的commitid,长id
	public static final String revision = "ea9469d046348950e5354c171e116915916dfc34";
	// 要保存到的代码文件夹所在位置
	public static final String destPath = "C:/Users/宏坤/Desktop/code";

	// --------------------------------------------------------------------------------
	// 如果想要获取以前提交的文件,把flag设为true
	public static final Boolean flag = false;
	// currentid填你当前版本的commitid
	public static final String currentid = "6a8c382d43e4dec30350bf985eaa418a94f35da5";
	// --------------------------------------------------------------------------------

}
