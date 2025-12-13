class Solution:
    def validateCoupons(self, code, line, active):
        line_id = {
            "electronics": 1,
            "grocery": 2,
            "pharmacy": 3,
            "restaurant": 4,
        }

        def ok_chars(s):
            return all(ch.isalnum() or ch == "_" for ch in s)

        def is_valid(i):
            if not active[i]:
                return False
            if not code[i]:
                active[i] = False
                return False
            if line[i] not in line_id:
                active[i] = False
                return False
            if not ok_chars(code[i]):
                active[i] = False
                return False
            return True

        valid = [i for i in range(len(code)) if is_valid(i)]
        valid.sort(key=lambda i: (line_id[line[i]], code[i]))
        return [code[i] for i in valid]