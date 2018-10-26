select
  /*%expand*/*
from
  m_guild_push_message
where
  guild_push_type = /* guildPushType */1
  and
  country_cd = /* countryCd */1
