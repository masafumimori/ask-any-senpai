USE studyabroad;

-- User demo
INSERT INTO mst_user
	(
	user_name, password, email, area, nation, purpose
	)
VALUES
	(
		"demo1", "demo", "demo@email.com", "アジア", "台湾", "大学院留学（長期）"
    ),
	(
		"demo2", "demo", "demo@email.com", "アジア", "フィリピン", "大学院留学（短期）"
    ),
	(
		"demo3", "demo", "demo@email.com", "ヨーロッパ", "ドイツ", "大学留学（短期）"
    ),
	(
		"demo4", "demo", "demo@email.com", "アジア", "タイ", "大学留学（長期）"
    ),
	(
		"demo5", "demo", "demo@email.com", "北アメリカ", "カナダ", "仕事関係"
    ),
	(
		"demo6", "demo", "demo@email.com", "アジア", "韓国", "語学留学"
    ),
	(
		"demo7", "demo", "demo@email.com", "ヨーロッパ", "イタリア", "ワーキングホリデー"
    ),
	(
		"demo8", "demo", "demo@email.com", "アジア", "ベトナム", "大学院留学（長期）"
    ),
	(
		"demo9", "demo", "demo@email.com", "ヨーロッパ", "イギリス", "ワーキングホリデー"
    ),
	(
		"demo10", "demo", "demo@email.com", "ヨーロッパ", "スペイン", "大学留学（短期）"
    ),
	(
		"demo11", "demo", "demo@email.com", "ヨーロッパ", "ポルトガル", "仕事関係"
    ),
	(
		"demo12", "demo", "demo@email.com", "ヨーロッパ", "フランス", "大学留学（短期）"
    ),
	(
		"demo13", "demo", "demo@email.com", "アジア", "中国", "大学留学（長期）"
    ),
	(
		"demo14", "demo", "demo@email.com", "オセアニア", "オーストラリア", "語学留学"
    ),
	(
		"demo15", "demo", "demo@email.com", "南アメリカ", "ブラジル", "仕事関係"
    ),
	(
		"demo16", "demo", "demo@email.com", "南アメリカ", "アルゼンチン", "大学院留学（長期）"
	),
	(
		"demo17", "demo", "demo@email.com", "北アメリカ", "アメリカ", "大学院留学（短期）"
	),
	(
		"demo18", "demo", "demo@email.com", "南アメリカ", "コロンビア", "大学留学（長期）"
	),
	(
		"demo19", "demo", "demo@email.com", "その他", "その他", "仕事関係"
	),
	(
		"demo20", "demo", "demo@email.com", "アフリカ", "南アフリカ", "ワーキングホリデー"
	),
	(
		"demo21", "demo", "demo@email.com", "アフリカ", "エジプト", "仕事関係"
	),
	(
		"demo22", "demo", "demo@email.com", "オセアニア", "ニュージーランド", "語学留学"
	)
;


-- User SNS demo
INSERT INTO mst_user_sns
	(
	user_id, user_name, twitter, instagram, facebook
	)
VALUES
	(
		1, "demo1", "demo", "demo", "demo"
	),
	(
		2, "demo2", null , "demo", "demo"
	),
	(
		3, "demo3", null , "demo", "demo"
	),
	(
		4, "demo4", null , "demo", "demo"
	),
	(
		5, "demo5", null , "demo", "demo"
	),
	(
		6, "demo6", null , "demo", "demo"
	),
	(
		7, "demo7", null , "demo", "demo"
	),
	(
		8, "demo8", null , "demo", "demo"
	),
	(
		9, "demo9", null , "demo", "demo"
	),
	(
		10, "demo10", null , "demo", "demo"
	),
	(
		11, "demo11", null , "demo", "demo"
	),
	(
		12, "demo12", null , "demo", "demo"
	),
	(
		13, "demo13", null , "demo", "demo"
	),
	(
		14, "demo14", null , "demo", "demo"
	)	
;