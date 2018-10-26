select
  /*%expand*/*
from
  m_gacha_production
where
  gacha_id = /* gachaId */1
  and
  step_id = /* stepId */1
  and
  production_rarity = /* productionRarity */1
  and
  production_type = /* productionType */1
  and
  production_id = /* productionId */1
