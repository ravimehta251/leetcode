SELECT 
    ROUND(
        COUNT(DISTINCT a.player_id) / 
        (SELECT COUNT(DISTINCT player_id) FROM Activity),
        2
    ) AS fraction
FROM Activity a
JOIN Activity a1
    ON a.player_id = a1.player_id
    AND a.event_date = DATE_ADD(a1.event_date, INTERVAL 1 DAY)
WHERE a1.event_date = (
    SELECT MIN(event_date)
    FROM Activity
    WHERE player_id = a1.player_id
);