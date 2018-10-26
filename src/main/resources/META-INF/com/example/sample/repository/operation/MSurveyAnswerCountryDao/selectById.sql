select
  /*%expand*/*
from
  m_survey_answer_country
where
  survey_answer_id = /* surveyAnswerId */1
  and
  index = /* index */1
  and
  country_cd = /* countryCd */1
