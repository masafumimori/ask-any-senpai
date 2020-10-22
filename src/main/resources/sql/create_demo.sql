USE studyabroad;

-- User demo
INSERT INTO mst_user
	(
	user_name, password, email, area, nation
	)
VALUES
	(
		"demo1", "demo", "demo@email.com", "asia", "taiwan"
    ),
	(
		"demo2", "demo", "demo@email.com", "asia", "philippines"
    ),
	(
		"demo3", "demo", "demo@email.com", "europe", "germany"
    ),
	(
		"demo4", "demo", "demo@email.com", "asia", "thailand"
    ),
	(
		"demo5", "demo", "demo@email.com", "america", "canada"
    ),
	(
		"demo6", "demo", "demo@email.com", "asia", "korea"
    ),
	(
		"demo7", "demo", "demo@email.com", "europe", "italy"
    ),
	(
		"demo8", "demo", "demo@email.com", "asia", "vietnam"
    ),
	(
		"demo9", "demo", "demo@email.com", "europe", "england"
    ),
	(
		"demo10", "demo", "demo@email.com", "europe", "spain"
    ),
	(
		"demo11", "demo", "demo@email.com", "europe", "portugal"
    ),
	(
		"demo12", "demo", "demo@email.com", "europe", "france"
    ),
	(
		"demo13", "demo", "demo@email.com", "asia", "china"
    ),
	(
		"demo14", "demo", "demo@email.com", "ociania", "australia"
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