class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        if len(hand)%groupSize!=0:
            return False
        hand.sort()
        count = {}
        for card in hand:
            count[card] = count.get(card, 0) + 1

        # try to make groups starting from the smallest card
        for card in hand:
            if count[card] == 0:
                continue  # already used this card

            # use this card to start a group
            for i in range(groupSize):
                next_card = card + i
                if count.get(next_card, 0) == 0:
                    return False  # can't find next consecutive card
                count[next_card] -= 1  # use one of that card
        return True