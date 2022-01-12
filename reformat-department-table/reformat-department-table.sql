select id,
sum(case when month = "Jan" then revenue else NULL end) as Jan_Revenue,
sum(case when month = "Feb" then revenue else NULL end) as Feb_Revenue,
sum(case when month = "Mar" then revenue else NULL end) as Mar_Revenue,
sum(case when month = "Apr" then revenue else NULL end) as Apr_Revenue,
sum(case when month = "May" then revenue else NULL end) as May_Revenue,
sum(case when month = "Jun" then revenue else NULL end) as Jun_Revenue,
sum(case when month = "Jul" then revenue else NULL end) as Jul_Revenue,
sum(case when month = "Aug" then revenue else NULL end) as Aug_Revenue,
sum(case when month = "Sep" then revenue else NULL end) as Sep_Revenue,
sum(case when month = "Oct" then revenue else NULL end) as Oct_Revenue,
sum(case when month = "Nov" then revenue else NULL end) as Nov_Revenue,
sum(case when month = "Dec" then revenue else NULL end) as Dec_Revenue
from Department 
group by id
order by id