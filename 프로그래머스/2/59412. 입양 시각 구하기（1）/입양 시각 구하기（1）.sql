-- 코드를 입력하세요
SELECT hour(DATETIME) as hour, count(*) as count
from ANIMAL_OUTS
where hour(DATETIME) >= 9 and hour(DATETIME) <= 19
group By hour(DATETIME)
order by hour(DATETIME)
