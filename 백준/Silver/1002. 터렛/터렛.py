import math

count = int(input())
results = []

for _ in range(count):
    x1, y1, r1, x2, y2, r2 = map(float, input().split())
    distance = math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)
    r_sum = r1 + r2
    r_diff = abs(r1 - r2)

    # 동일한 중심
    if x1 == x2 and y1 == y2:
        if r1 == r2:
            results.append(-1)  # 무한대 접점
        else:
            results.append(0)  # 접점 없음
    # 외접
    elif distance == r_sum:
        results.append(1)
    # 내접
    elif distance == r_diff:
        results.append(1)
    # 두 원이 교차
    elif r_diff < distance < r_sum:
        results.append(2)
    # 두 원이 서로 떨어짐
    else:
        results.append(0)

# 결과 출력
for result in results:
    print(result)
