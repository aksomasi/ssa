SELECT puck.puck_name as puckName, 
environment.owner_name as environmentName,
"owner".owner_name as ownerName
FROM puck
INNER JOIN environment ON environment.env_key = puck.env_key
INNER JOIN puck_family ON puck_family.puck_family_key = puck.puck_family_key
INNER JOIN "owner"  ON "owner".id = puck_family.owner_key