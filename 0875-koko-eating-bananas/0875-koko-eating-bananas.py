class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        minSpeed=1
        maxSpeed = max(piles)
        res = maxSpeed
        def canEat(piles, h, speed):
            hours = 0
            for pile in piles:
                hours += math.ceil(float(pile)/speed)
            return hours<=h
        while minSpeed <= maxSpeed:
            speed = (minSpeed+maxSpeed)//2
            if canEat(piles, h, speed):
                res = speed
                maxSpeed = speed - 1
            else:
                minSpeed = speed + 1
        return res
