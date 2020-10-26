USE studyabroad;

-- User demo
INSERT INTO mst_user
	(
	user_name, password, email, area, nation, purpose
	)
VALUES
	(
		"demo1", "demo", "demo@email.com", "asia", "taiwan", "long_grad"
    ),
	(
		"demo2", "demo", "demo@email.com", "asia", "philippines", "short_grad"
    ),
	(
		"demo3", "demo", "demo@email.com", "europe", "germany", "short_undergrad"
    ),
	(
		"demo4", "demo", "demo@email.com", "asia", "thailand", "long_undergrad"
    ),
	(
		"demo5", "demo", "demo@email.com", "america", "canada", "work"
    ),
	(
		"demo6", "demo", "demo@email.com", "asia", "korea", "study_lang"
    ),
	(
		"demo7", "demo", "demo@email.com", "europe", "italy", "work_holiday"
    ),
	(
		"demo8", "demo", "demo@email.com", "asia", "vietnam", "long_grad"
    ),
	(
		"demo9", "demo", "demo@email.com", "europe", "england", "work_holiday"
    ),
	(
		"demo10", "demo", "demo@email.com", "europe", "spain", "short_grad"
    ),
	(
		"demo11", "demo", "demo@email.com", "europe", "portugal", "work"
    ),
	(
		"demo12", "demo", "demo@email.com", "europe", "france", "short_undergrad"
    ),
	(
		"demo13", "demo", "demo@email.com", "asia", "china", "long_undergrad"
    ),
	(
		"demo14", "demo", "demo@email.com", "oceania", "australia", "study_lang"
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