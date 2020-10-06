USE studyabroad;

-- User demo
INSERT INTO mst_user
    (
    user_name, password, email, area, nation
    )
VALUES
    (
        "masa", "masa123", "masa@gmail.com", "asia", "japan"
    ),
    (
        "yamada", "yamada123", "yamada@gmail.com", "europe", "england"
    ),
    (
        "michael", "mic123", "michael@yahoo.com", "africa", "southafrica"
    )
;


-- User SNS demo
INSERT INTO mst_user_sns
	(
	user_id, user_name, twitter, instagram, facebook
	)
VALUES
	(
		"1", "masa", "morimamama", "morimamama123", "XXXXX"
	)
;